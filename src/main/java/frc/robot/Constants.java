
package frc.robot;


import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.math.filter.SlewRateLimiter;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Subsystems.*;

public final class Constants {

    public static final Motor motor = new Motor();
    public static final Lights lights = new Lights();

    //Status Constants
    public static final int motorId = 1; //CAN ID

    public static final CommandXboxController swerveController = new CommandXboxController(0);

}