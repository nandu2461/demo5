package com.example.studentdetails.demo;




import javax.persistence.*;

@Entity
@Table
public class StudentEntity
{
    @Id
    @Column
    long sphoneno;
    String sfname;
    String slname;
    String address;
    long sparentphoneno;

    public void init() {

    }

    public StudentEntity()
    {

    }

    public long getSphoneno() {
        return sphoneno;
    }

    public void setSphoneno(long sphoneno) {
        this.sphoneno = sphoneno;
    }

    public String getSfname() {
        return sfname;
    }

    public void setSfname(String sfname) {
        this.sfname = sfname;
    }

    public String getSlname() {
        return slname;
    }

    public void setSlname(String slname) {
        this.slname = slname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getSparentphoneno() {
        return sparentphoneno;
    }

    public void setSparentphoneno(long sparentphoneno) {
        this.sparentphoneno = sparentphoneno;
    }
}