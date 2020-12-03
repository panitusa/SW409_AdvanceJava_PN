# SW409_AdvanceJava_PN

This Panit's all of Java homework and Labs during Spring 2020 [SW409_AdvnaceJava] at Fairfield University. 

This course focusing on how to deploy Java/Angular using AWS cloud services.

You may find descroption of each individual Lab/Homeowork below.

#Lab1

1. Download  Patient , PatientGUI and TestPatient classes
2. Make it running and make sure that it creates the output file with Patient oblect.

3. Modify the project as  mentioned below

   a. Read Patient's data from file instead of  hard coding as shown below

Patient p1 = new Patient(1,"aaa");

alist.add(p1);

b. Patient's object should have at least 5. 
c. Replace the Patient's id textbox with drop down.
d. Add Exit button.

#Lab2 

Attach CRUD for Student(model,service and controller)

Attach screen shots of postman for the CRUD operations.

#Lab3

Submit the Student project (zip  it and submit)

Summit the screen shot of postman response and Student table

#Lab4

Submit  the zipped version of the routerdemo angular project.

Submit the screen shot of the Login, profile,and Register.

#Lab5

Upload the zipped version of your project.

Attach the screen shot of the profile page with logged in user Id

#Lab6

T0DO

#Lab7

Continue Angular and fecthing (Lesson) and make it display on Angular UI

#Lab8

AWS CloudFront: Distrubution 

Link : http://d3f9wern2az7gn.cloudfront.net

#Lab9 

AWS Beanstalk

Link : http://blackboardbackend-env.eba-sznbzsng.us-east-1.elasticbeanstalk.com

#Lab10 

Submit the Maven project with TestNG and RestAssured.

Attach screenshots that show the test results

#Lab11 

AWS Heroku deployment URL

#HW1

Create CRUD operations for  accessing Patients' data.
Patient class should have name, id, gender, illness
GET operation should bring list of Patients.   (api/v1/patients)
POST  operation should add a Patient data.    (api/vi/patients)
UPDATE operation should update the Patient's information based on id (api/vi/patients/{patientId})
DELETE operation should delete Patient based on id
Bonus: Another GET operation  should get the names of all the patients that have the illness sent in the url.  (api/v1/patients/{illness})

#HW2

Part 1:

Make sure your lab 3 is working. We did only get all students records from database using  the below line of code.
       

              return (ArrayList ) (studentRepository.findAll());


      Use the following code to make sure  that the rest of the CRUD works. 

      // post

      return studentRepository.save(stu);

      // update

      public void updateStudent(Integer id, Student student) {

       Student oldstudent = studentRepository.findById(id).get();

       oldstudent.setAge(student.getAge());

       oldstudent.setName(student.getName());xd

        studentRepository.save(student);

         }

       // delete

        studentRepository.deleteById(id);



     Only attach the screen shots of mysql query editor and the postman 

Part 2:

       Implement Homework 1 CRUD operation with mysql.
       Zip up the project and upload along with the screen shots of mysql query editor and the postman for all the CRUD operations .

#HW3

Make sure lab 5 is up and running. Add the following functionality

Create a function in userservice calles findUserById that takes id as a  parameter and returns the user object if found.

Modify the code in profile controller(profile.component.ts)  to return user object instead of userId.

Modify profile.component.html to display the name of the user corresponding to the userId in the url path.

#HW4

Use the EMPLOYEE CRUD you created  for midterm.

Create artifacts and delpoy to aws beanstalk.

Use the beanstalk URL in testNG project to automate the CRUD.

You should come up with good assertions for testing the rest apis.
