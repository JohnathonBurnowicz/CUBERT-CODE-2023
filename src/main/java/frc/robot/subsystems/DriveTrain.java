// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.hal.simulation.ConstBufferCallback;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.PrintCommand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {

  private final MotorControllerGroup left;
  private final WPI_TalonFX left1;
  private final WPI_TalonFX left2;

  private final MotorControllerGroup right;
  private final WPI_TalonFX right1;
  private final WPI_TalonFX right2;

  private final DifferentialDrive drive;

  /** Creates a new DriveTrain. */
  public DriveTrain() {

    left1 = new WPI_TalonFX(Constants.LEFT_MOTOR_1);
    left2 = new WPI_TalonFX(Constants.LEFT_MOTOR_2);
    left1.configFactoryDefault();
    left2.configFactoryDefault();
    left1.setNeutralMode(NeutralMode.Brake);
    left2.setNeutralMode(NeutralMode.Brake);
    left1.setInverted(false);
    left2.setInverted(false);
  
     left = new MotorControllerGroup(left1,left2);

    right1 = new WPI_TalonFX(Constants.RIGHT_MOTOR_1);
    right2 = new WPI_TalonFX(Constants.RIGHT_MOTOR_2);
    right1.configFactoryDefault();
    right2.configFactoryDefault();
    right1.setNeutralMode(NeutralMode.Brake);
    right2.setNeutralMode(NeutralMode.Brake);
    right1.setInverted(true);
    right2.setInverted(true);

    
    right = new MotorControllerGroup(right1,right2);

    drive = new DifferentialDrive(left, right);


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }



//public void driveWithJoysticks(XboxController controller, double speed) {
 // drive.arcadeDrive(-(controller.getRawAxis(Constants.XBOX_LEFT_X_AXIS)*(-speed*0.55)),-(controller.getRawAxis(Constants.XBOX_LEFT_Y_AXIS)*speed));
//}
public void CycleDrive(double speed, double rotation){
  drive.arcadeDrive( speed, rotation);
  }

public void driveForward(double speed) {

  drive.tankDrive(speed, speed);

}
public void turnLeft(double speed){

  drive.tankDrive(-speed, -speed);
}
public void stop(){
  drive.stopMotor();
}










}