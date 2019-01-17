
package com.noqshop.manage.enity;

 

import java.io.Serializable;

import java.time.LocalDate;

 

package com.noqshop.manage.enity;

 

import java.io.Serializable;

import java.time.LocalDateTime;

 

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;

 

import lombok.Data;

 

@Entity

public class User implements Serializable{

             

              /**

               *

               */

              private static final long serialVersionUID = -1854232208745459138L;

 

              public Integer getUserID() {

                             return userID;

              }

 

              public void setUserID(Integer userID) {

                             this.userID = userID;

              }

 

              public String getUserName() {

                             return userName;

              }

 

              public void setUserName(String userName) {

                             this.userName = userName;

              }

 

              public String getPassword() {

                             return password;

              }

 

              public void setPassword(String password) {

                             this.password = password;

              }

 

              public String getEmailID() {

                             return emailID;

              }

 

              public void setEmailID(String emailID) {

                             this.emailID = emailID;

              }

 

              public LocalDateTime getCreatedTimeStamp() {

                             return createdTimeStamp;

              }

 

              public void setCreatedTimeStamp(LocalDateTime createdTimeStamp) {

                             this.createdTimeStamp = createdTimeStamp;

              }

 

              public static long getSerialversionuid() {

                             return serialVersionUID;

              }

              @Id

              @GeneratedValue

              private Integer userID;

             

              private String userName;

             

              private String password;

             

              private String emailID;

             

              private LocalDateTime createdTimeStamp;

 

}
