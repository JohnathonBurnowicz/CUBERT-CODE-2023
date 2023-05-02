// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID;

//import java.lang.invoke.ClassSpecializer.SpeciesData;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveTrain;
 
public class ShiftingDrive extends CommandBase {
    private final DriveTrain driveTrain;





  /** Creates a new DriveWithJoysticks. */
  public ShiftingDrive(DriveTrain dt) {
    // Use addRequirements() here to declare subsystem dependencies.
  driveTrain = dt;
  addRequirements(driveTrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
  double SpeedMultiplier;
  if (RobotContainer.driverJoystick.leftBumper().getAsBoolean())   {
    SpeedMultiplier = 1;
  }

  else {
    SpeedMultiplier = 0.5;
  } 
 

 // if (RobotContainer.driverJoystick.getRawAxis(Constants.RIGHT_TRIGGER) > 50 ) {
   // SpeedMultiplier = 1;
  
  //}
  //else if (RobotContainer.driverJoystick.getRawAxis(Constants.LEFT_TRIGGER) > 50 ) {

//SpeedMultiplier = 0.25;
  //}
  //else {

    //SpeedMultiplier = 0.5;
      //}
  
      double DirectionMultiplier;
  if (RobotContainer.driverJoystick.rightBumper().getAsBoolean())   {
    DirectionMultiplier = -1;
  }

  else {
    DirectionMultiplier = 1;
  }
 //while getRightBumperPressed()
 


  
 

  XboxController controller = new XboxController(0);
  driveTrain.CycleDrive((controller.getRawAxis(Constants.XBOX_RIGHT_X_AXIS)*(Constants.DRIVETRAINSPEED)*DirectionMultiplier*SpeedMultiplier), (DirectionMultiplier*(controller.getRawAxis(Constants.XBOX_LEFT_Y_AXIS)*(Constants.TURNSPEED))));
    }


  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}