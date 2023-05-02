// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.commands.DriveForwardTimed;
import frc.robot.commands.DriveWithJoysticks;
import frc.robot.commands.ShiftingDrive;
import frc.robot.commands.PneumaticsCommand;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.PneumaticSub;
import frc.robot.subsystems.PneumaticSub2;
import frc.robot.commands.PneumaticsCommand2;
import frc.robot.subsystems.PneumaticSub3;
import frc.robot.commands.PneumaticsCommand3;
import frc.robot.commands.ShiftingDrive;
import frc.robot.commands.PneumaticsCommand4;
import frc.robot.subsystems.PneumaticSub4;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
//import frc.robot.subsystems.ShooterSubsystem;
//import frc.robot.commands.ShootWithButton;
/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
 
  // DriveTrain Declare
  private final DriveTrain driveTrain;

  private final DriveForwardTimed driveForwardTimed;
private final PneumaticSub pneumaticSub = new PneumaticSub();
private final PneumaticSub2 pneumaticSub2 = new PneumaticSub2();
private final PneumaticSub3 pneumaticSub3 = new PneumaticSub3();
private final PneumaticSub4 pneumaticSub4 = new PneumaticSub4();

private boolean direction = true;
private boolean slowspeed = true;

//shooter declare
//private final ShooterSubsystem shooterSubsystem;



public static CommandXboxController driverJoystick = new CommandXboxController(Constants.DRIVER_JOYSTICK_PORT);;

/** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
//Driver commands
    driveTrain = new DriveTrain();

    driveForwardTimed = new DriveForwardTimed(driveTrain);
    driveForwardTimed.addRequirements(driveTrain);
    

    driveTrain.setDefaultCommand(new DriveWithJoysticks(driveTrain, () -> driverJoystick.getLeftY(), () -> driverJoystick.getRightX(), () -> direction, () -> slowspeed));
 




  //  shooterSubsystem = new ShooterSubsystem();
    

    // Configure the button bindings
    configureButtonBindings();

}

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    //Pneumatic button bindings
    driverJoystick.a().onTrue(new PneumaticsCommand(pneumaticSub));
  
    driverJoystick.b().onTrue(new PneumaticsCommand2(pneumaticSub2));

    driverJoystick.x().onTrue(new PneumaticsCommand3(pneumaticSub3));

    driverJoystick.y().onTrue(new PneumaticsCommand4(pneumaticSub4));

    driverJoystick.rightBumper().onTrue(new InstantCommand(() -> direction = !direction));
    
    driverJoystick.leftBumper().onTrue(new InstantCommand(() -> slowspeed = !slowspeed));

    //shooter button binding
/*JoystickButton DriverYButton = new JoystickButton(driverJoystick, Constants.XBOX_Y_BUTTON);
   // JoystickButton DriverBButton = new JoystickButton(driverJoystick, Constants.XBOX_B_BUTTON);
DriverYButton.whenPressed(new ShootWithButton(shooterSubsystem));
*/
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return driveForwardTimed;
    
    
  }}
