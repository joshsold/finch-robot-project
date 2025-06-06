# Final Project: Finch Robot Challenges
MR AIELLO, README INFORMATION STARTS ON LINE 70
## Essential Question
How can we apply object-oriented programming principles and Java concepts to create interactive, autonomous robot behaviors that solve real-world challenges?

## Project Overview
In this project-based learning experience, you will program a Finch 2.0 robot to perform one of three challenges:
3. Navigate a maze autonomously

Your program must demonstrate your understanding of Java programming concepts from APCSA and object-oriented design principles while creating an engaging robot behavior.

## Learning Objectives
- Apply Java programming concepts in a physical computing context
- Implement object-oriented design principles
- Develop problem-solving skills through algorithm development
- Create well-documented and maintainable code
- Practice technical communication through presentations and documentation

## Timeline/Checklist
- chose what type of project I want to do
- took picture of maze map, researched maze algorithms
- chose to hug the right wall
- implemented if the finch detects light, turns right
- recorded video, final complete
### Planning & Research
- Choose your challenge: dance, drawing, or maze navigation
- Explore the Finch API documentation
- Review sample programs from BirdBrain Technologies
- Create a project plan with pseudocode/flow charts/
- Clone and set up GitHub repository for your project

### Development
- Write initial code implementation
- Test basic functionality with the Finch robot
- Debug and refine your approach
- Document your progress and challenges

### Implementation & Testing
- Complete core functionality implementation
- Conduct thorough testing with the robot
- Optimize code for readability and efficiency
- Start preparing documentation

### Finalization
- Finalize code and ensure complete functionality
- Complete README documentation
- Prepare for demonstration
- Submit final project to GitHub

### Deployment
- Demonstrate your project

## Required Components

### Technical Requirements
Your program must include at least 5 of these Java/OOP concepts:
- Inheritance/Subclasses
- Method overloading or overriding
- Arrays or ArrayLists
- Loops (for, while, etc.)
- Conditional statements
- Exception handling
- File I/O for configuration or logging
- Constants and static methods
- User input processing

### Documentation Requirements
- Well-commented code with appropriate Javadoc
- GitHub repository with organized file structure
- README.md file including:
  * Project description and objectives
  - This project is a maze runner that utilizes an algorithm that hugs the right wall. It does so by utilizing turns and stopping when in front of a wall; in addition, another measure is added when we point a flashlight over the finch, the robot turns right, so we still have control and not completely autonomous
  * Description of design choices
  - design implements some autonominity, it turns right when facing a wall, if there is still a wall after, makes a 180 degree turn and continues to go
  - decided to use lights to stop after Mr aiello showcased the finch feature
  - this is NOT a program that just relys on sequential programming
  * Challenges faced and solutions
  - in vs code, i had to download powershell and figure out autosave, took a solid day
  - in coding, the robot kept getting too close/too far away from the wall, so we had to make changes regarding the distance the robot detects to make a turn
  * Future enhancements
  - if I had more time, i would implement lighting and a better stop call once the robot reaches the end.
  * Video or images of your robot in action (embedded or linked)
  [![Video Title](assets/thumbnail.png)](https://youtube.com/shorts/rHZcKsGLmU8?si=kB1AKl0zjmzZSoYf)

## Project Rubric (16 points total)

| Category | 4 Points | 3 Points | 2 Points | 1 Point |
|----------|----------|----------|----------|---------|
| **Program Functionality** | Program fully accomplishes the chosen challenge with additional creative features. Robot behavior is refined, reliable, and impressive. | Program successfully completes the chosen challenge with minor limitations. Robot behavior is consistent and functional. | Program partially completes the challenge with some inconsistencies. Robot behavior has notable limitations. | Program fails to achieve the core objectives of the challenge. |
| **Code Quality & OOP Implementation** | Code demonstrates excellent OOP design with 6+ APCSA concepts implemented effectively. Code is elegant, efficient, and well-structured. | Code uses good OOP practices with 5 APCSA concepts implemented correctly. Code is readable and organized. | Code implements basic OOP structure with minimum required APCSA concepts. Some organizational issues present. | Code lacks proper OOP implementation or has significant structural problems. |
| **Documentation & GitHub Repository** | Exceptional documentation with comprehensive README, well-commented code, and excellent repository organization. | Complete documentation with clear README, adequately commented code, and organized repository. | Basic documentation with minimal README, some comments, and basic repository structure. | Insufficient documentation or poorly organized repository. |
| **Development & Version Control** | The repository demonstrates excellent use of Git and GitHub by having many commits and updates to one or more branches of the repository | The repository shows great use of Git and GitHub by having more than 2 new commits to the repository | The repository demonstrates basic used of Git and GitHub by having at least 1 new commit to a branch of the repository | The repository only have the initial clone of the or no project submitted |

## Challenge-Specific Guidelines

### Dance Challenge
Create a choreographed dance routine for your Finch that synchronizes:
- Movement patterns (forward/backward, turns)
- LED light displays (beak and tail)
- Sound patterns using the buzzer
- Consider using arrays to store sequences of movements/lights/sounds

### Drawing Challenge
Program your Finch to create an artistic drawing:
- Design an algorithm to create a recognizable pattern or image
- Use precise motor control for clean lines
- Consider incorporating sensor data to affect the drawing
- Create a system to track position on the drawing surface

### Maze Navigation Challenge
Program your Finch to navigate through a maze:
- Use distance sensors to detect walls
- Implement an algorithm for maze solving (wall following, etc.)
- Consider storing and analyzing the path taken
- Add visual/audio feedback during navigation
- Optional: Allow for maze "learning" and optimization on repeated runs

## Resources
- Finch API Documentation (provided in class)
- [BirdBrain Technologies Learning Resources](https://learn.birdbraintechnologies.com/finch/java/program/)
- [Java API Documentation](https://docs.oracle.com/en/java/javase/11/docs/api/index.html)

## Extension Opportunities
If you complete your chosen challenge early, consider:
- Adding sensor-responsive behaviors to your program
- Creating a user interface to control robot parameters (JFrame, Swing, JavaFX)
- Implementing multiple modes of operation
- Adding an obstacle detection and avoidance system