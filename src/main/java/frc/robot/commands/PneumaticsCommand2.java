// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.subsystems.PneumaticSub2;

public class PneumaticsCommand2 extends CommandBase {

  private final PneumaticSub2 pneumaticsub2;
private boolean isDone = false;

  /** Creates a new PneumaticsCommand. */
  public PneumaticsCommand2(PneumaticSub2 pt) {
    // Use addRequirements() here to declare subsystem dependencies.
    pneumaticsub2 = pt;
    addRequirements(pneumaticsub2);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
this.pneumaticsub2.setSolenoid();
this.isDone = true;


  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
   
    }
    

  

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return this.isDone;
  }
}
