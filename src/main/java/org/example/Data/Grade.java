package org.example.Data; /***********************************************************************
 * Module:  Grade.java
 * Author:  11411
 * Purpose: Defines the Class Grade
 ***********************************************************************/

import org.example.Role.Student;

/** @pdOid 9bf76eb7-716a-4ce7-a585-65d1a5d62e58 */
public class Grade {
   /** @pdOid 487c1daa-9f47-414f-b45f-8f39165ae8ef */
   private int stu_id;
   /** @pdOid a565f23f-2189-47e5-b3c0-151abfefd1b2 */
   private int cour_id;
   /** @pdOid 6d53ad0e-8f65-4566-a1f9-ba3f583796c4 */
   private int grade;
   /** @pdOid 386545f6-140d-40a1-9503-93fd0b4c40fb */
   private int gradeId;

   public Grade(int stu_id, int cour_id, int grade, int gradeId) {
      this.stu_id = stu_id;
      this.cour_id = cour_id;
      this.grade = grade;
      this.gradeId = gradeId;
   }

   public int getStu_id() {
      return stu_id;
   }

   public void setStu_id(int stu_id) {
      this.stu_id = stu_id;
   }

   public int getCour_id() {
      return cour_id;
   }

   public void setCour_id(int cour_id) {
      this.cour_id = cour_id;
   }

   public int getGrade() {
      return grade;
   }

   public void setGrade(int grade) {
      this.grade = grade;
   }

   public int getGradeId() {
      return gradeId;
   }

   public void setGradeId(int gradeId) {
      this.gradeId = gradeId;
   }
}