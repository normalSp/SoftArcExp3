package org.example.Role; /***********************************************************************
 * Module:  Teacher.java
 * Author:  11411
 * Purpose: Defines the Class Teacher
 ***********************************************************************/

import org.example.Data.Course;
import org.example.Data.Grade;

import java.util.*;

/** @pdOid 5eab889a-d118-4431-9ccb-30ed01e64de2 */
public class Teacher {
   /** @pdOid 3ad2b658-1b3f-4028-820e-70cf84b94e8c */
   private int tea_id;
   /** @pdOid 78328c83-7672-421a-b7ea-63dc1706e4ce */
   private String tea_name;
   /** @pdOid 9bc88ab9-f35b-421e-909f-fadb92a941e2 */
   private String tea_password;
   
   /** @pdRoleInfo migr=no name=Course assc=Association_4 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public Collection<Course> course;
   /** @pdRoleInfo migr=no name=Grade assc=Association_5 coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public Grade grade;
   
   /** @param tea_id 
    * @param tea_password
    * @pdOid 8a3119da-b765-4736-a4a9-8baf57b61139 */
   public boolean login(int tea_id, String tea_password) {
      // TODO: implement
      return false;
   }
   
   /** @param course
    * @pdOid 87b101d8-ca6a-46f5-937e-d465b617462a */
   public List<Student> getStudntList(Course course) {
      // TODO: implement
      return null;
   }
   
   /** @param course 
    * @param stu_id
    * @pdOid 88f63a3d-da60-4266-952c-bfd27fd92456 */
   public boolean scoreEntry(Course course, int stu_id) {
      // TODO: implement
      return false;
   }
   
   /** @param teaId
    * @pdOid e570eb76-bfec-49bf-b768-c2b8d32294cc */
   public Boolean teacher(int teaId) {
      // TODO: implement
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

}