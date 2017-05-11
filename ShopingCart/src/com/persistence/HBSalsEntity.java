package com.persistence;

import jdk.nashorn.internal.runtime.logging.Logger;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by dimon on 10/05/2017.
 */
@Entity
@Table(name = "sals", schema = "public", catalog = "skistuff")
public class HBSalsEntity {


    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "salary")
    private BigDecimal salary;

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Basic
    @Column(name = "emp_id")
    private Integer empId;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HBSalsEntity that = (HBSalsEntity) o;

        if (id != that.id) return false;
        if (salary != null ? !salary.equals(that.salary) : that.salary != null) return false;
        if (empId != null ? !empId.equals(that.empId) : that.empId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        return result;
    }


}
