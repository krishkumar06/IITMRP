package com.example.airline.bean;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "Date1")
public class User {



   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;



   @Column(name = "Date1")
    private Date date1;
    @Column(name = "NumOfDate")
    private Integer nums;



   public long getId() {
        return id;
    }



   public void setId(long id) {
        this.id = id;
    }



   public Date getDate1() {
        return date1;
    }



   public void setDays(Date date1) {
        this.date1 = date1;
    }
    public Integer getNum() {
        return nums;
    }
    public void setNum(Integer nums) {
        this.nums=nums;
    }
    
     public User() {



        super();
        }



       public User(Date date1) {
            super();
            this.date1= date1;
            
        }
}