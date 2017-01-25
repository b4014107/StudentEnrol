package com.enrol

class Course {

String department

String title

String leader

String code

Date startDate

Date endDate

String description

int numberOfStudents

double tuitionFees

String studyMode

    static constraints = {
title blank:false, nullable:false

department blank:false, nullable:false

description blank:false, nullable:false, maxSize:5000 

startDate blank:false, nullable:false

endDate blank:false, nullable:false

leader blank:false, nullable:false

tuitionFees blank:false, nullable:false, scale: 2

code blank:false, nullable:false

numberOfStudents blank:false, nullable:false, min:20, max:60

studyMode blank:false, nullable:false, size: 1..20
 

    }
}
