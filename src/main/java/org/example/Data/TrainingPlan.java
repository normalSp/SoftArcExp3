package org.example.Data; /***********************************************************************
 * Module:  TrainingPlan.java
 * Author:  11411
 * Purpose: Defines the Class TrainingPlan
 ***********************************************************************/

import org.example.Data.Course;

import java.util.*;

/** @pdOid 3a79073f-3a60-4c6b-af3c-5589bb957465 */
public class TrainingPlan {
   /** @pdOid 076282a9-b697-4082-8519-a18d141322c4 */
   private int stu_id;
   /** @pdOid f72630ab-dbf9-44d1-b324-8e154f64dece */
   private String describe;
   /** @pdOid 6f1cd282-f582-4fe9-a2f5-1e4e6d166ff6 */
   private List<Course> cour_list;
   /** @pdOid 6cb7111c-b808-474a-b032-0c9e6608bafb */
   private int train_id;

   public int getStu_id() {
      return stu_id;
   }

   public void setStu_id(int stu_id) {
      this.stu_id = stu_id;
   }

   public String getDescribe() {
      return describe;
   }

   public void setDescribe(String describe) {
      this.describe = describe;
   }

   public List<Course> getCour_list() {
      return cour_list;
   }

   public void setCour_list(List<Course> cour_list) {
      this.cour_list = cour_list;
   }

   public int getTrain_id() {
      return train_id;
   }

   public void setTrain_id(int train_id) {
      this.train_id = train_id;
   }

   public TrainingPlan(int stu_id, String describe, List<Course> cour_list, int train_id) {
      this.stu_id = stu_id;
      this.describe = describe;
      this.cour_list = cour_list;
      this.train_id = train_id;
   }
}