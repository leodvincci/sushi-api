# Sushi API

The Sushi API is a RESTful API built using Java and Spring Boot that allows users to retrieve aggregated sushi data.
Getting Started

To get started, follow these steps:

    Clone the repository: git clone https://github.com/your-username/sushi-api.git
    Navigate to the project directory: cd sushi-api
    Build the project: ./gradlew build
    Run the application: ./gradlew bootRun

The application will start running at http://localhost:8080.
Endpoints

The following endpoints are available:
GET /sushi

Retrieves a list of aggregated sushi data.
Parameters
Parameter	Description
location	The location to retrieve data for.
type	The type of sushi to retrieve data for.
from	The start date to retrieve data from.
to	The end date to retrieve data to.
Response

The response will be a JSON array of objects, each representing aggregated sushi data. The following fields are included:
Field	Type	Description
location	string	The location the data is for.
type	string	The type of sushi the data is for.
count	number	The number of times the sushi has been ordered.
revenue	number	The total revenue from the sushi.
Contributing

Contributions to the Sushi API are welcome! To contribute, follow these steps:

    Fork the repository.
    Create a new branch: git checkout -b my-new-branch
    Make your changes and commit them: git commit -am 'Add some feature'
    Push to the branch: git push origin my-new-branch
    Create a new pull request.

License

The Sushi API is open source and is licensed under the MIT License.
