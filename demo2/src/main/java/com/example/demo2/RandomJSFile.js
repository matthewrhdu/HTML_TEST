const API_BASE_URL = "http://localhost:8080"

/**
 * Gets all students from the database and updates the DOM with these students.
 */
function getAllStudents() {

    // Make API request and read the response body as a JSON object
    fetch(`${API_BASE_URL}`).then(response => response.json())
        //    Update the DOM
        .then(thing => updateStudentsOnDOM(thing));
}


/**
 * Accepts a list of student objects and updates the DOM with the correct data from these objects.
 * @param students a list of student objects
 */
function updateStudentsOnDOM(students){

    let studentContainerContents = "";

    students.forEach(thing => {
        // Note: It would be a better design to not return an array of strings, but to list each field in the response.
        // But just for the sake of a demo, this will work.

        const studentObj = {
            ...thing, // This syntax will "destructure" the existing student
            // object
            name: thing.getSomething()
        };

        studentContainerContents += `
            <div>
               <b>Name:</b> ${studentObj.name}}
            </div>
        `;
    });

    console.log(studentContainerContents);
    document.querySelector("#studentContainer").innerHTML = studentContainerContents;
}

// Here we call the function, so the script will run when the page loads.
getAllStudents();
