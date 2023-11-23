package org.example.Data; /***********************************************************************
 * Module:  Course.java
 * Author:  11411
 * Purpose: Defines the Class Course
 ***********************************************************************/

import org.example.Role.Teacher;

/** @pdOid 03e2247f-1691-4018-8767-ce87392dfc1e */
public class Course {
   /** @pdOid 10329d26-93f1-42ee-bfcd-70be58154082 */
   private int cour_id;
   /** @pdOid 2bc436f4-faf3-48fa-b627-a0e0e0eb687b */
   private int cour_name;
   /** @pdOid 8eb1e8c9-2a65-4163-bda1-caf3dfa40a5f */
   private Teacher teacher;
   
   /** @pdRoleInfo migr=no name=Grade assc=Association_7 coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public Grade grade;
   
   /** @pdOid 584b4290-e617-4c69-964c-c552177034e2 */
   public int getCourseId() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 3cdcec16-1767-42e6-8c16-72af33024d9c */
   public String getCourseName() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid f919a1fa-d0e8-4f06-b424-9dc29852c8c6 */
   public Teacher getTeacher() {
      // TODO: implement
      return null;
   }
   
   /** @param courId
    * @pdOid 8dcbc6d5-e1c1-41fd-801f-7fcbd34009f2 */
   public Boolean course(int courId) {
      // TODO: implement
      return null;
   }

}