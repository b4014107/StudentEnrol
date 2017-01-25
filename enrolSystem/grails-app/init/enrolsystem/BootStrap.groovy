package com.enrol

class BootStrap {

    def init = { servletContext ->

	def computing = new Course(
	title:'BSc Hon Computing',
	code:'COMP234',
	leader:'Dr Mary Poppins',
	department:'Computing',
	startDate:new Date('11/11/2016'),
	endDate:new Date('11/11/2020'),
	numberOfStudents:45,
	description:'''Add some text here''',

	tuitionFees:9000,
	studyMode:'Full-time'
).save()

	def configsystems = new Module(
	title:'Configuration Systems',
	code:'COE-TRU-REW',
	credits:'20',
	lecturer:'Tonderai',
	course:'Computer Science',
	description:'''Add some text here''',

).save()

    }
    def destroy = {
    }
}
