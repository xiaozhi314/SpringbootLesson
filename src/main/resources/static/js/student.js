$(function(){
	$.ajax({
		url:"/index/getAllStudents",
		type:"GET",
		success(result){
			console.log(result);
			generateStudentTable(result);
		}
	})
});

function generateStudentTable(students){
	$.each(students,function(index,student){
		let id=$("<td></td>").append(student.id);
		let stu_id=$("<td></td>").append(student.stu_id);
		let stu_name=$("<td></td>").append(student.stu_name);
		let gender=$("<td></td>").append(student.gender);
		let age=$("<td></td>").append(student.age);
		let tr=$("<tr></tr>").append(id).append(stu_id).append(stu_name).append(gender).append(age);
		tr.appendTo("#students");
	})
	
$(document).on("click","#submit",function(){
	let text = $("#student_name").val();
	$.ajax({
		url:"/index/getSingleStudents",
		type:"GET",
		data:"studentName="+text,
		success(result){
			console.log(result);
		}
	})
	
	
})
	
}