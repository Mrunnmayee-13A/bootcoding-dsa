package com.bootcoding.dsa.collections.arraylist.example;
import java.util.*;
public class StudentMarkService {
        public List<SubjectMark> generateSubjectMarks(int size){
            List<SubjectMark> subjectMarks = new ArrayList<>();
            for(int i =0; i < size; i++){
                SubjectMark subjectMark = createSubjectMark();
                subjectMarks.add(subjectMark);
            }
            return subjectMarks;
        }

       // public void calculation(){

       // }

        public Map<String, Integer> getSubjectCount(List<SubjectMark> marks){

            Map<String, Integer> data = new HashMap<>();
            for(SubjectMark mark: marks){
                if(data.containsKey(mark.getSubject())){
                    Integer existingCount = data.get(mark.getSubject());
                    data.put(mark.getSubject(), existingCount + 1);
                }else{
                    data.put(mark.getSubject(), 1);
                }
            }
            return data;
        }
        public SubjectMark createSubjectMark() {
            SubjectMark sm = new SubjectMark();
            sm.setTotalMarks(100);
            sm.setObtainedMarks(getRandomMarks());
            sm.setSubject(getRandomSubject());
            return sm;
        }
        String[] subjects = {"Mathematics-I", "Database", "Computer Networks",
                "Theory of Computation", "SEM", "Operating System", "AI", "DOS", "DS",
                "SP"};

        private String getRandomSubject(){
            Random random = new Random();
            int randomIndex = random.nextInt(subjects.length);
            return subjects[randomIndex];
        }
        private int getRandomMarks(){
            Random random = new Random();
            return 20 + random.nextInt(80);
        }

    }

