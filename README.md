# Peaje_and_Vehiculos

This repository is part of coursework for the Full Stack Web Development course from [Factoria F5](https://factoriaf5.org).

This is a simple Java Spring Boot project that models a toll system. Vehicles arriving at toll stations are charged different fees based on their type (car, motorcycle, truck), and the system keeps track of the total amount of tolls collected.


## Instructions 

You are required to develop a program that models a toll system. Toll stations have a name, the city they are located in, and a numeric value representing the total toll collected.

Vehicles arriving at a toll station have a registration plate. The toll charges different amounts depending on the type of vehicle. If it is a car, the toll fee is $100. If it is a motorcycle, the fee is $50. For trucks, the toll fee depends on the number of axles, with $50 charged per axle.

The toll station needs to calculate the toll fee for each vehicle that arrives and keep track of the total toll collected. At the end, the system should print a list of all the vehicles that arrived at the toll station and the total amount collected.

### Required

- **Java 21** or higher
- **Maven 3.8.6** or higher
- IDE of your choice (IntelliJ IDEA, Eclipse, VSCode, etc.)
- For running tests: JUnit 5 (already included in the project dependencies)


### Installation steps
1. **Clone the repository**
    ```bash
    git clone https://github.com/Snysic/Peaje_and_Vehiculos.git
    cd Proyecto---Peaje_and_Vehiculos
    ```

2. **Set up the project in the IDE**
    - Open the project in your preferred IDE.
    - Ensure the JDK is configured correctly.
    - Verify the `pom.xml` file is present, as well as the dependencies.

3. **Run the application**
    - Navigate to the `Main` class in your IDE.
    - Run the `Main` class from the IDE, or from the terminal.