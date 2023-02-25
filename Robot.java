// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import java.lang.Math;

public class Robot extends TimedRobot {

  private BuiltInAccelerometer accelerometer = new BuiltInAccelerometer();

  @Override
  public void robotInit() {
  
  }

  @Override
  public void teleopPeriodic() {

    double accel_z = accelerometer.getZ();
    SmartDashboard.putNumber("Accelerometer Z", accel_z);

    double accel_y = accelerometer.getY();
    SmartDashboard.putNumber("Accelerometer Y", accel_y);

    double accel_x = accelerometer.getX();
    SmartDashboard.putNumber("Accelerometer X", accel_x);

    double angle = Math.atan(accel_x /  accel_z);
    SmartDashboard.putNumber("Angle", angle);
  }
}
