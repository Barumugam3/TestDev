package com.testdrive.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.testdrive.dao.AbstractDao;
import com.testdrive.model.Employee;

@Repository("EmployeeDao")
public class EmployeeDaoImpl extends AbstractDao<Integer, Employee> implements EmployeeDao {

	@Override
	public Employee findById(int id) {
		Employee employee = getByKey(id);		
		return employee;
	}

	@Override
	public Employee findByEmployeeId(String employeeid) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("employeeid", employeeid));
		Employee employee = (Employee)crit.uniqueResult();
		
		return employee;
	}

	@Override
	public void save(Employee employee) {
		persist(employee);
		
	}

	@Override
	public void update(Employee employee) {
		update(employee);
		
	}

	@Override
	public void deleteByEmployeeId(String employeeid) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("employeeid", employeeid));
		Employee employee = (Employee)crit.uniqueResult();
		delete(employee);		
	}

	@Override
	public List<Employee> findAllEmployees() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("firstName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Employee> employees = (List<Employee>) criteria.list();
		return employees;
	}

	@Override
	public Employee selectMaxOfEmployeeId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> selectAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
