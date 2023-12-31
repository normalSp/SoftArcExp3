package org.example.Role; /***********************************************************************
 * Module:  AdminSystem.java
 * Author:  11411
 * Purpose: Defines the Class AdminSystem
 ***********************************************************************/

import org.example.Data.Course;
import org.example.Data.Grade;
import org.example.Data.TrainingPlan;

import java.util.*;

/** @pdOid 72739ad0-2533-4b19-9955-c380b0b659d5 */
public class AdminSystem {
   /** @pdOid 52b3258c-b87d-4b25-b1cd-1e207736ebaa */
   private List<Student> stu_list;
   /** @pdOid 9ee046f3-4d0b-4a8f-8057-60c4938bc4a3 */
   private List<Teacher> tea_list;
   /** @pdOid 1af4f0f8-4c93-4c5a-babb-cac46ae87319 */
   private List<Course> cour_list;
   private List<Course> select_cour_list;
   private List<TrainingPlan> train_list;
   private List<Grade> grade_list;

   /** @pdOid 485a6661-95ba-46bd-97dd-683b39d86681 */
   private int admin_id;
   /** @pdOid 05a1fab8-6eb7-43ec-8519-562bd32280c5 */
   private int admin_password;

   private static AdminSystem instance = null;
   
   /** @pdRoleInfo migr=no name=Student assc=Association_1 coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public Student student;
   /** @pdRoleInfo migr=no name=Course assc=Association_3 coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public Course course;
   /** @pdRoleInfo migr=no name=Grade assc=Association_6 coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public Grade grade;
   /** @pdRoleInfo migr=no name=TrainingPlan assc=Association_8 coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public TrainingPlan trainingPlan;
   /** @pdRoleInfo migr=no name=AdminSystem assc=association10 mult=1..1 type=Aggregation */
   public AdminSystem adminSystemB;
   
   /** @param admin_id 
    * @param admin_password
    * @pdOid e6424df4-518c-4f88-a5d2-8063c5f79f03 */
   public boolean login(int admin_id, String admin_password) {
      // TODO: implement
      if(admin_id == this.admin_id && admin_password == this.admin_password)
         return true;
      return false;
   }
   
   /** @pdOid 6b100edf-be21-4fec-b732-2564680f731b */
   public List<Student> getStudentList() {
      // TODO: implement
      return this.stu_list;
   }
   
   /** @pdOid 1a139685-0bda-4224-a865-8003164c5c28 */
   public List<Teacher> getTeacherList() {
      // TODO: implement
      return this.tea_list;
   }
   
   /** @pdOid 69543440-1e63-4dd9-80eb-7daa14651a45 */
   public List<Course> getCourseList() {
      // TODO: implement
      return this.cour_list;
   }
   
   /** @param stu_id 
    * @param cour_id
    * @pdOid 1934bbd7-adf1-443f-bd2e-ac85d0bdab95 */
   public Course approveCourseSelection(int stu_id, int cour_id) {
      // TODO: implement
      return null;
   }
   
   /** @param course
    * @pdOid b85a0109-e01c-40be-a391-17f186e5e795 */
   public boolean addCourse(Course course) {
      // TODO: implement
      this.cour_list.add(course);
      return true;
   }
   
   /** @param cour_id
    * @pdOid 9d519205-18ff-4d04-96f8-df48e62c0b73 */
   public boolean deleteCourse(int cour_id) {
      // TODO: implement
      this.cour_list.remove(cour_id);
      return true;
   }
   
   /** @param student
    * @pdOid e5a572b9-7002-458d-a9b4-6bef584dfd20 */
   public boolean addStudent(Student student) {
      // TODO: implement
      this.stu_list.add(student);
      return true;
   }
   
   /** @param stu_id
    * @pdOid ad0c3093-e3dc-48f5-a1f2-6f5d5ceeb8a3 */
   public boolean deleteStudent(int stu_id) {
      // TODO: implement
      this.stu_list.remove(stu_id);
      return true;
   }
   
   /** @param teacher
    * @pdOid 03d834a1-eba1-4f96-afdd-78322017c834 */
   public boolean addTeacher(Teacher teacher) {
      // TODO: implement
      this.tea_list.add(teacher);
      return true;
   }
   
   /** @param tea_id
    * @pdOid 4251ed04-9efa-4d9d-a199-38ac87ce6fa4 */
   public boolean deleteTeacher(int tea_id) {
      // TODO: implement
      this.tea_list.remove(tea_id);
      return true;
   }
   
   /** @param stu_id 
    * @param cour_id 
    * @param grade
    * @pdOid 45a7c873-1fea-48f1-86fa-00a48832f288 */
   public boolean addGrade(int stu_id, int cour_id, int grade, int grade_id) {
      // TODO: implement
      Grade grade1 = new Grade(stu_id, cour_id, grade, grade_id);
      this.grade_list.add(grade1);
      return false;
   }
   
   /** @param cour_id
    * @pdOid 07609841-46a4-48c9-a287-304257906127 */
   public boolean addCourseToTrainPlan(int cour_id) {
      // TODO: implement
      for(int i = 0, len = this.course_list.size(); i < len; i++){
         if (this.course_list.get(i).getCourse_id() == cour_id) {
            for (int j = 0, len1 = this.grade_list.size(); j < len1; j++) {
                if (this.grade_list.get(j).getGrade_id() == cour_id) {
                   this.cour_list.add(grade_list.get(j));
                   return true;
                     }
                }
         }
      }
      return false;
   }

   
   /** @param train_id
    * @pdOid 1b5f03fd-fb7a-42c6-a6f6-3a88c3e34716 */
   public boolean alterTrainingPlanDescribe(int train_id, String des) {
      // TODO: implement
      for(int i = 0, isize = this.cour_list.size(); i < isize; i++){
         if(this.train_list.get(i).getTrain_id() == train_id){
            train_list.get(i).setDescribe(des);
            return true;
         }
      }
      return false;
   }
   
   /** @pdOid 57621299-4cda-45c3-b3ac-892cc2b52085 */
   public AdminSystem getInstance() {
      if(instance == null)
         instance = new AdminSystem();
      return instance;
   }

   private AdminSystem(){}

   public List<Course> getCour_list() {
      return cour_list;
   }

   public List<Course> getSelectCour_list(int stu_id) {
      select_cour_list.removeAll();
      for(int i = 0; i < this.cour_list.size(); i++)
         if (this.cour_list.get(i).getStu_id() == stu_id)
            {
                select_cour_list.add(this.cour_list.get(i));
            }
            if (select_cour_list.size() == 0) {
                this.cour_list.removeAll(this.cour_list);
                select_cour_list.add(this.cour_list.get(0));
            }
      return select_cour_list;
   }

   public List<TrainingPlan> getTrain_list() {
      return train_list;
   }

   public void setTrain_list(List<TrainingPlan> train_list) {
      this.train_list = train_list;
   }
}