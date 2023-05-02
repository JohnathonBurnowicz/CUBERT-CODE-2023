// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import javax.xml.namespace.QName;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    //Drive Motor CAN ID's
    public static final int LEFT_MOTOR_1 = 1;
    public static final int LEFT_MOTOR_2 = 2;
    public static final int RIGHT_MOTOR_1 = 3;
    public static final int RIGHT_MOTOR_2 = 4;

//Shooter Motor CAN ID's
//public static final int LEFT_SHOOTER = 7;
//public static final int RIGHT_SHOOTER = 11;

    


    // Motor Speeds
    public static final double DRIVETRAINSPEED = 1;
    public static final double TURNSPEED = 1;
    
    public static final double DRIVE_FORWARD_TIME = 4.0;
    public static final double AUTONOMOUS_SPEED = -0.5;
    
    public static final double SHOOTERSPEED = 0.25;
    //Joystick Controller Numbers
    public static final int DRIVER_JOYSTICK_PORT = 0;

    //Xbox Mappings
    public static final int XBOX_LEFT_Y_AXIS = 1;
    public static final int XBOX_LEFT_X_AXIS = 0;
    public static final int XBOX_RIGHT_Y_AXIS = 5;
    public static final int XBOX_RIGHT_X_AXIS = 4;
    public static final int XBOX_A_BUTTON = 1;
    public static final int XBOX_B_BUTTON = 2;
    public static final int XBOX_X_BUTTON = 3;
    public static final int XBOX_Y_BUTTON = 4;
   
    public static final int LEFT_TRIGGER = 2;
	public static final int RIGHT_TRIGGER = 3;

    public static final int LB = 5;
	public static final int RB = 6;

}