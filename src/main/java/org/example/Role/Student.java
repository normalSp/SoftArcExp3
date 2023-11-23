package org.example.Role; /***********************************************************************
 * Module:  Student.java
 * Author:  11411
 * Purpose: Defines the Class Student
 ***********************************************************************/

import org.example.Data.Course;
import org.example.Data.TrainingPlan;

import java.util.*;

/** @pdOid 39d33e71-8df9-4022-94d6-5d0eed552090 */
public class Student {
   /** @pdOid 52afb32a-ee82-4620-8a77-c5b2661f8f0e */
   private int stu_id;
   /** @pdOid d54b5e9c-85c4-4332-9fa9-c1e5ad95f339 */
   private String stu_name;
   /** @pdOid 41175ea3-8c9a-4cf5-bbc5-56eae88fea94 */
   private String stu_password;
   /** @pdOid 12d07e02-7d09-4404-90a1-0909aa25a49f */
   private int train_id;
   
   /** @pdRoleInfo migr=no name=Course assc=Association_2 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public Collection<Course> course;
   /** @pdRoleInfo migr=no name=TrainingPlan assc=Association_9 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public Collection<TrainingPlan> trainingPlan;

   public Student stu = null;
   /** @param stu_id 
    * @param stu_name 
    * @param stu_password
    * @pdOid 10d5e19e-d943-49fc-bd75-ef0ceb20c875 */
   public boolean register(int stu_id, String stu_name, String stu_password) {
      // TODO: implement
      stu = new Student(stu_id, stu_name, stu_passwordu);
      return stu;
   }

   public Student(int stu_id, String stu_name, String stu_password) {
      this.stu_id = stu_id;
      this.stu_name = stu_name;
      this.stu_password = stu_password;
   }

   /** @param stu_id
    * @param stu_password
    * @pdOid bb6be6b9-d596-4e7c-bfc5-00e558f9399e */
   public boolean login(int stu_id, String stu_password) {
      // TODO: implement
      if(this.stu_id == stu_id && this.stu_password == stu_password)
         return true;
      return false;
   }
   
   /** @pdOid 982ea76b-3830-467a-8193-900bdedb5345 */
   public List<Course> getCourseList(AdminSystem admin) {
      // TODO: implement
      return admin.getCour_list;
   }
   
   /** @pdOid 80f216cf-07b8-4156-8f7b-ed1bd732c101 */
   public List<Course> getSelectdeCourses(AdminSystem admin) {
      // TODO: implement
      int stu_id = stu.getStu_id();
      if (stu_id > 0)
          return admin.getSelectCour_list(stu_id);
      else
      return null;
   }

   public int getStu_id() {
      return stu_id;
   }

   /** @param cour_id
    * @pdOid da2ea534-aceb-4171-a151-a526e06e1e64 */
   public Course selectCourse(int cour_id, AdminSystem admin) {
      // TODO: implement
      List<Course> course_list = admin.getCour_list();
      List<TrainingPlan> train_list = admin.getTrain_list();
      for(int i = 0; i < course_list.size(); i++) {
         if (cour_id == course_list.get(i).getCour_id()) {
            for (int j = 0; j < train_list.size(); j++) {
               if (this.stu_id == train_list.get(j).getStu_id()) {
                  train_list.get(j).setCourse_id(cour_id);
                  return true;
               }
            }
         }
      }
      return null;
   }

   /** @param cour_id
    * @pdOid 92929130-f401-4c70-ba8d-935b57d1ee6a */
   public boolean withdrawCourse(int cour_id, AdminSystem admin) {
      // TODO: implement
      List<TrainingPlan> train_list = admin.getTrain_list;
      for(int i =0, i < train_list.size(); i++){
         if(cour_id == train_list.get(i).getCour_id()) {
            train_list.remove(i);
            admin.setTrain_list(train_list);
            return true;
         }
      }
      return false;
   }
   
   /** @param train_id
    * @pdOid 40ac5964-bbbb-480d-80c4-1931a8e43361 */
   public TrainingPlan getTrainingPlan(int train_id, AdminSystem admin) {
      // TODO: implement
      List<TrainingPlan> train_list = admin.getTrain_list;
      for(int i =0, i < train_list.size(); i++){
         if(train_id == train_list.get(i).getTrain_id())
            return train_list.get(i);
      }
      return null;
   }
   
   /** @pdGenerated default getter */
   public Collection<Course> getCourse() {
      if (course == null)
         course = new HashSet<Course>();
      return course;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorCourse() {
      if (course == null)
         course = new HashSet<Course>();
      return course.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCourse */
   public void setCourse(Collection<Course> newCourse) {
      removeAllCourse();
      for (Iterator iter = newCourse.iterator(); iter.hasNext();)
         addCourse((Course)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCourse */
   public void addCourse(Course newCourse) {
      if (newCourse == null)
         return;
      if (this.course == null)
         this.course = new HashSet<Course>();
      if (!this.course.contains(newCourse))
         this.course.add(newCourse);
   }
   
   /** @pdGenerated default remove
     * @param oldCourse */
   public void removeCourse(Course oldCourse) {
      if (oldCourse == null)
         return;
      if (this.course != null)
         if (this.course.contains(oldCourse))
            this.course.remove(oldCourse);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCourse() {
      if (course != null)
         course.clear();
   }
   /** @pdGenerated default getter */
   public Collection<TrainingPlan> getTrainingPlan() {
      if (trainingPlan == null)
         trainingPlan = new HashSet<TrainingPlan>();
      return trainingPlan;
   }
   
   /** @pdGenerated default iterator getter */
   public Iterator getIteratorTrainingPlan() {
      if (trainingPlan == null)
         trainingPlan = new HashSet<TrainingPlan>();
      return trainingPlan.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTrainingPlan */
   public void setTrainingPlan(Collection<TrainingPlan> newTrainingPlan) {
      removeAllTrainingPlan();
      for (Iterator iter = newTrainingPlan.iterator(); iter.hasNext();)
         addTrainingPlan((TrainingPlan)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTrainingPlan */
   public void addTrainingPlan(TrainingPlan newTrainingPlan) {
      if (newTrainingPlan == null)
         return;
      if (this.trainingPlan == null)
         this.trainingPlan = new HashSet<TrainingPlan>();
      if (!this.trainingPlan.contains(newTrainingPlan))
         this.trainingPlan.add(newTrainingPlan);
   }
   
   /** @pdGenerated default remove
     * @param oldTrainingPlan */
   public void removeTrainingPlan(TrainingPlan oldTrainingPlan) {
      if (oldTrainingPlan == null)
         return;
      if (this.trainingPlan != null)
         if (this.trainingPlan.contains(oldTrainingPlan))
            this.trainingPlan.remove(oldTrainingPlan);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTrainingPlan() {
      if (trainingPlan != null)
         trainingPlan.clear();
   }

}