// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


import edu.wpi.first.math.MathUtil;
import edu.wpi.first.math.filter.SlewRateLimiter;
import edu.wpi.first.math.geometry.Transform3d;
import edu.wpi.first.net.PortForwarder;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.Commands.SlowCommand;
import frc.robot.Subsystems.Lights;
import edu.wpi.first.wpilibj.smartdashboard.Field2d;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.PowerDistribution;
import edu.wpi.first.wpilibj.RobotBase;
import edu.wpi.first.wpilibj.PowerDistribution.ModuleType;
import edu.wpi.first.wpilibj.SPI;

public class Robot extends TimedRobot {
    private boolean startedSwerve = false;
    private RobotContainer robot;
    Command autoCommand;
    Lights lights = Constants.lights;

  @Override
  public void robotInit() {

    robot = new RobotContainer();
    lights.setColorGreen(30,150,50);

  }

  @Override
  public void robotPeriodic(){
    Lights.strip.setData(Lights.ledBuffer);
    CommandScheduler.getInstance().run();


  }

  @Override
  public void autonomousInit() {
    autoCommand = robot.getAutonomousCommand();

    if(autoCommand != null){
      autoCommand.schedule();
    }
  }

  @Override
  public void autonomousPeriodic() {


  }
  
  public void teleopInit() {



  }

  boolean fieldRelative = false;
  @Override
  public void teleopPeriodic() {

  

  }

  public void disabledInit() {
    CommandScheduler.getInstance().cancelAll();
  }

  public void disabledPeriodic(){
  }
}