package com.chinatip.assignment3.database;

import java.util.List;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class PatternJDBCTemplate implements PatternDAO {

	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	public void create(String name, String group, String implementation) {
		String SQL = "insert into `pattern` (`name`, `group`, `implementation`) values (?, ?, ?)";
		jdbcTemplateObject.update( SQL, name, group, implementation);
		System.out.println("SQL :" + jdbcTemplateObject.toString());
		System.out.println("Created Record name = " + name + " group = " + group + " implementation = " + implementation);
		return;
	}
	public Pattern getPattern(Integer id) {
		String SQL = "select * from pattern where id = ?";
		Pattern pattern = jdbcTemplateObject.queryForObject(SQL,
				new Object[]{id}, new PatternMapper());
		return pattern;
	}
	public List<Pattern> listPatterns() {
		String SQL = "select * from pattern";
		List <Pattern> patterns = jdbcTemplateObject.query(SQL,
				new PatternMapper());
		return patterns;
	}
	public void delete(Integer id){
		String SQL = "delete from pattern where id = ?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id );
		return;
	}
	public void update(Integer id, String name, String group, String implementation ){
		String SQL = "update pattern set `name` = ?, `group` = ?, `implementation` = ? where id = ?";
		jdbcTemplateObject.update(SQL, name, group, implementation, id);
		System.out.println("Updated Record with ID = " + id );
		return;
	}
}