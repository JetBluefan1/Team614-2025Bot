// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import static edu.wpi.first.units.Units.*;

import edu.wpi.first.math.geometry.Translation3d;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.units.LinearVelocityUnit;
import edu.wpi.first.units.MassUnit;
import edu.wpi.first.units.Measure;
import edu.wpi.first.units.TimeUnit;
import swervelib.math.Matter;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final Measure<MassUnit> ROBOT_MASS = Pounds.of(60);
  public static final Matter CHASSIS =
      new Matter(new Translation3d(0, 0, Units.inchesToMeters(8)), ROBOT_MASS.in(Kilogram));
  public static final Measure<TimeUnit> LOOP_TIME =
      Seconds.of(0.13); // s, 20ms + 110ms sprk max velocity lag
  public static final Measure<LinearVelocityUnit> MAX_SPEED = FeetPerSecond.of(14.5);

  public static final class DrivebaseConstants {
    // Hold time on motor brakes when disabled.
    public static final Measure<TimeUnit> WHEEL_LOCK_TIME = Seconds.of(10);
  }

  public static class OperatorConstants {
    // Joystick deadband.
    public static final double LEFT_X_DEADBAND = 0.1;
    public static final double LEFT_Y_DEADBAND = 0.1;
    public static final double RIGHT_X_DEADBAND = 0.1;
    public static final double TURN_CONSTANT = 6;
  }
}
