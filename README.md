# Duck Simulation System

## Description
This Java-based Duck Simulation System follows the Strategy Design Pattern, allowing dynamic behavior changes for different types of ducks. It separates behaviors such as flying, quacking, and swimming into distinct interfaces, making them easily interchangeable. The system supports multiple duck types and enables dynamic behavior assignment at runtime.

## Prerequisites
- Java Development Kit (JDK) 8 or later must be installed on your system.
- A text editor or Integrated Development Environment (IDE) (e.g., IntelliJ IDEA, Eclipse, VS Code) for editing and compiling the code.
- Command line or terminal access to compile and run Java programs.

1. To verify your Java installation, run:
   ```sh
   java -version

## Files & Classes Overview

### Behavior Interfaces
- **QuackBehaviour.java**: Defines an interface with a method `quack()` for quacking behavior.
- **FlyBehaviour.java**: Defines an interface with a method `fly()` for flying behavior.
- **SwimBehaviour.java**: Defines an interface with a method `swim()` for swimming behavior.

### Behavior Implementations
- **Quack.java**: Implements `QuackBehaviour`; its `quack()` method outputs a standard quacking sound.
- **NoQuack.java**: Implements `QuackBehaviour`; its `quack()` method indicates that the duck cannot quack.
- **Squeak.java**: Implements `QuackBehaviour`; its `quack()` method outputs a squeaking sound.
- **Fly.java**: Implements `FlyBehaviour`; its `fly()` method indicates normal flying behavior.
- **NoFly.java**: Implements `FlyBehaviour`; its `fly()` method indicates that the duck is unable to fly.
- **SwimWithLegs.java**: Implements `SwimBehaviour`; its `swim()` method indicates swimming using legs.
- **Floating.java**: Implements `SwimBehaviour`; its `swim()` method indicates floating on water.
- **Sink.java**: Implements `SwimBehaviour`; its `swim()` method indicates sinking in water.

### Duck Hierarchy
- **Duck.java**: Abstract base class for all ducks. It contains fields for `QuackBehaviour`, `FlyBehaviour`, and `SwimBehaviour` and methods to set and perform these behaviors. It also declares an abstract `display()` method.
- **RedheadDuck.java**: Extends `Duck` and represents a redhead duck with its own implementation of `display()` and default behaviors.
- **RubberDuck.java**: Extends `Duck` and represents a rubber duck, typically using no flying behavior, a squeaking quack, and floating behavior.
- **MallardDuck.java**: Extends `Duck` and represents a mallard duck with natural flying, quacking, and swimming behaviors.
- **DecoyDuck.java**: Extends `Duck` and represents a decoy duck that does not fly or quack.

### Main Class
- **Main.java**: Contains the menu-driven program that allows users to create different duck types, change their behaviors dynamically, and display their actions.

## Classes & Methods Details

### QuackBehaviour Interface
- **Method:** `quack()`
  - *Description:* Defines the quacking behavior for ducks.

### FlyBehaviour Interface
- **Method:** `fly()`
  - *Description:* Defines the flying behavior for ducks.

### SwimBehaviour Interface
- **Method:** `swim()`
  - *Description:* Defines the swimming behavior for ducks.

### Quack Class
- **Implements:** `QuackBehaviour`
- **Method:** `quack()`
  - *Description:* Outputs a standard quack sound (e.g., "Quack! Quack!").

### NoQuack Class
- **Implements:** `QuackBehaviour`
- **Method:** `quack()`
  - *Description:* Outputs a message indicating that the duck cannot quack.

### Squeak Class
- **Implements:** `QuackBehaviour`
- **Method:** `quack()`
  - *Description:* Outputs a squeaking sound, suitable for rubber ducks.

### Fly Class
- **Implements:** `FlyBehaviour`
- **Method:** `fly()`
  - *Description:* Outputs a message indicating normal flying behavior.

### NoFly Class
- **Implements:** `FlyBehaviour`
- **Method:** `fly()`
  - *Description:* Outputs a message indicating the duck is unable to fly.

### SwimWithLegs Class
- **Implements:** `SwimBehaviour`
- **Method:** `swim()`
  - *Description:* Outputs a message indicating that the duck swims using its legs.

### Floating Class
- **Implements:** `SwimBehaviour`
- **Method:** `swim()`
  - *Description:* Outputs a message indicating that the duck floats on water.

### Sink Class
- **Implements:** `SwimBehaviour`
- **Method:** `swim()`
  - *Description:* Outputs a message indicating that the duck sinks in water.

### Duck Abstract Class
- **Fields:** 
  - `quackBehaviour` (of type `QuackBehaviour`)
  - `flyBehaviour` (of type `FlyBehaviour`)
  - `swimBehaviour` (of type `SwimBehaviour`)
- **Methods:**
  - `setQuackBehaviour(QuackBehaviour qb)`: Sets the duck's quack behavior.
  - `setFlyBehaviour(FlyBehaviour fb)`: Sets the duck's fly behavior.
  - `setSwimBehaviour(SwimBehaviour sb)`: Sets the duck's swim behavior.
  - `performQuack()`: Executes the current quack behavior.
  - `performFly()`: Executes the current fly behavior.
  - `performSwim()`: Executes the current swim behavior.
  - `display()`: Abstract method to display duck information.

### RedheadDuck Class
- **Extends:** `Duck`
- **Description:** Implements the `display()` method to show details specific to a Redhead Duck. Inherits default behavior for flying, quacking, and swimming.

### RubberDuck Class
- **Extends:** `Duck`
- **Description:** Implements the `display()` method to show details specific to a Rubber Duck. Typically uses `NoFly` for flying, `Squeak` for quacking, and `Floating` for swimming.

### MallardDuck Class
- **Extends:** `Duck`
- **Description:** Implements the `display()` method to show details specific to a Mallard Duck. Usually exhibits natural flying, quacking, and swimming behaviors.

### DecoyDuck Class
- **Extends:** `Duck`
- **Description:** Implements the `display()` method to show details specific to a Decoy Duck. Typically uses `NoFly` and `NoQuack` behaviors.

### Main Class
- **Method:** `main(String[] args)`
  - *Description:* The entry point for the program. It presents a menu-driven interface that allows users to:
    - Create different types of ducks.
    - Dynamically change a duck's quack, fly, or swim behavior.
    - Display the actions of the created duck.
    - Exit the simulation.

## How to Run the Program
1. Compile all Java files:
   - Example: `javac Main.java`
2. Run the program:
   - Example: `java Main`
3. Follow the menu prompts to create and modify duck behaviors.


