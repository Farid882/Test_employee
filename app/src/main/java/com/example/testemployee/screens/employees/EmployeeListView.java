package com.example.testemployee.screens.employees;

import com.example.testemployee.pojo.Employee;

import java.util.List;

public interface EmployeeListView {
    public void loadData(List<Employee> employees);
    public void showError();
}
