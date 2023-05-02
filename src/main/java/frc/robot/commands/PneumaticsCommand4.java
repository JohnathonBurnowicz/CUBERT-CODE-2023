// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.subsystems.PneumaticSub;
import frc.robot.subsystems.PneumaticSub4;
public class PneumaticsCommand4 extends CommandBase {

  private final PneumaticSub4 pneumaticsub4;
private boolean isDone = false;

  /** Creates a new PneumaticsCommand. */
  public PneumaticsCommand4(PneumaticSub4 pt) {
    // Use addRequirements() here to declare subsystem dependencies.
    pneumaticsub4 = pt;
    addRequirements(pneumaticsub4);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
this.pneumaticsub4.setSolenoid();
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
