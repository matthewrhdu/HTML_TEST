const API = "http://localhost:8080/"

function getAllStudents() {
//    Make an API Call

    const DATA = {
        students: [
            {
                name: 'Riyan',
                student_no: 1000
            },
            {
                name: 'Yifu',
                student_no: 2000
            }
        ]
    }

    let studentContainerContents = "";

    DATA.students.forEach(
        student => {
            studentContainerContents += `
    <div>
       <b>Name:</b> ${student.name} <br/>
       <b>Student No:</b> ${student.student_no}
    </div>
            `;
        }
    )

    console.log(studentContainerContents);
    document.querySelector("#studentContainer").innerHTML = studentContainerContents;

    fetch(API).then(
        res => {
            res.data.students.forEach(
                student => {
                    studentContainerContents += `
    <div class="studentDataNode">
       <b>Name:</b> ${student.name} <br/>
       <b>Student No:</b> ${student.student_no}
    </div>
            `;
                }
            );

            document.querySelector("#studentContainer").innerHTML = studentContainerContents;
        }
    )
//    Update the DOM
}

getAllStudents();
