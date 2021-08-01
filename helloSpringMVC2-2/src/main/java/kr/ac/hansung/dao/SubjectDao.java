package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Subject;

@Repository
public class SubjectDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public int getRowCount() {
		String sqlStatement = "select count(*) from subject";
		return jdbcTemplate.queryForObject(sqlStatement, Integer.class);
	}

	// query and return a single object
	public Subject getSubject(String name, String professor) {
		String sqlStatement = "select * from subject where name=?";
		return jdbcTemplate.queryForObject(sqlStatement, new Object[] { name, professor }, new RowMapper<Subject>() {

			@Override
			public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {

				Subject subject = new Subject();

				subject.setYear(rs.getInt("year"));
				subject.setSemester(rs.getInt("semester"));
				subject.setName(rs.getString("name"));
				subject.setCategory(rs.getString("category"));
				subject.setProfessor(rs.getString("professor"));
				subject.setGrade(rs.getInt("grade"));

				return subject;
			}

		});
	}

	// query and return a multiple object
	// cRud
	public List<Subject> getSubjects() {
		String sqlStatement = "select * from subject";
		return jdbcTemplate.query(sqlStatement, new RowMapper<Subject>() {

			@Override
			public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {

				Subject subject = new Subject();

				subject.setYear(rs.getInt("year"));
				subject.setSemester(rs.getInt("semester"));
				subject.setName(rs.getString("name"));
				subject.setCategory(rs.getString("category"));
				subject.setProfessor(rs.getString("professor"));
				subject.setGrade(rs.getInt("grade"));

				return subject;
			}
		});
	}
	
	public List<Subject> getSubject2(int year, int semester) {
		String sqlStatement = "select * from subject where year=? and semester=?";
		return jdbcTemplate.query(sqlStatement, new Object[] {year, semester} , new RowMapper<Subject>() {

			@Override
			public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {
				Subject subject = new Subject();

				subject.setYear(rs.getInt("year"));
				subject.setSemester(rs.getInt("semester"));
				subject.setName(rs.getString("name"));
				subject.setCategory(rs.getString("category"));
				subject.setProfessor(rs.getString("professor"));
				subject.setGrade(rs.getInt("grade"));

				return subject;
			}
		});
	}
	
	public int getGrade(int year, int semester) {
		String sqlStatement = "select sum(grade) from subject where year=? and semester=?";
		return jdbcTemplate.queryForObject(sqlStatement, new Object[] {year, semester}, Integer.class);
	}
	

	// Crud method
	public boolean insert(Subject subject) {
		int year = subject.getYear();
		int semester = subject.getSemester();
		String name = subject.getName();
		String category = subject.getCategory();
		String professor = subject.getProfessor();
		int grade = subject.getGrade();

		String sqlStatement = "insert into subject (year, semester, name, category, professor, grade) values (?,?,?,?,?,?)";
		return (jdbcTemplate.update(sqlStatement, new Object[] { year, semester, name, category, professor, grade }) == 1);
	}

	// crUd method
	public boolean update(Subject subject) {
		int year = subject.getYear();
		int semester = subject.getSemester();
		String name = subject.getName();
		String category = subject.getCategory();
		String professor = subject.getProfessor();
		int grade = subject.getGrade();

		String sqlStatement = "update subject set year=?, semster=?, category=?, grade=? where name=? and professor=?";
		return (jdbcTemplate.update(sqlStatement, new Object[] { year, semester, name, category, professor, grade }) == 1);
	}

	// cruD method
	public boolean delete(String name, String professor) {
		String sqlStatement = "delete from class where name=? and professor=?";
		return (jdbcTemplate.update(sqlStatement, new Object[] { name, professor }) == 1);
	}
	
}
