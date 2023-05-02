// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import frc.robot.commands.SpeedChange;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

public class DriveWithJoysticks extends CommandBase {
  private final DriveTrain driveTrain;
  private DoubleSupplier speed;
  private DoubleSupplier rotation;
  private BooleanSupplier direction;
  private BooleanSupplier slowspeed;
  /** Creates a new DriveWitJoysticks. */
  public DriveWithJoysticks(DriveTrain driveTrain, DoubleSupplier speed, DoubleSupplier rotation, BooleanSupplier direction, BooleanSupplier slowspeed) {
    this.driveTrain = driveTrain;
    this.speed = speed;
    this.rotation = rotation;
    this.direction = direction;
    this.slowspeed = slowspeed;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(driveTrain);
  }

  //public DriveWithJoysticks(DriveTrain driveTrain2, DoubleSupplier doubleSupplier, DoubleSupplier doubleSupplier2,
 //     BooleanSupplier booleanSupplier, BooleanSupplier booleanSupplier2, Object object) {
 // }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if(direction.getAsBoolean()) {
      driveTrain.CycleDrive(speed.getAsDouble(), -rotation.getAsDouble());
    }
    
    else{
      driveTrain.CycleDrive(-speed.getAsDouble(), -rotation.getAsDouble());
    }
    
  
  //if(slowspeed.getAsBoolean()) {
   // driveTrain.CycleDrive(0.5*-speed.getAsDouble(), -rotation.getAsDouble());
  //}else{
   // driveTrain.CycleDrive(-speed.getAsDouble(), -rotation.getAsDouble());
  //}
}


  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    driveTrain.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
