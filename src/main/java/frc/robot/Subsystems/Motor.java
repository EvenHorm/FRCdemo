package frc.robot.Subsystems;

import com.revrobotics.AbsoluteEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.SparkLimitSwitch;
import com.revrobotics.SparkMaxLimitSwitch;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.math.controller.ArmFeedforward;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.math.controller.ProfiledPIDController;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DutyCycleEncoder;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class Motor extends SubsystemBase{

    private CANSparkMax motor;
    public RelativeEncoder motorEncoder;

    public Motor() {

        motor = new CANSparkMax(Constants.motorId, MotorType.kBrushless);
        motor.restoreFactoryDefaults();
        motor.setIdleMode(IdleMode.kCoast); //can change to coast or brake
        motor.setInverted(false);

        motor.burnFlash();

        motorEncoder = motor.getEncoder();
    }
    public void forwardSlow() {

        motor.set(0.5); //-1.0 to 1.0 range
        
    }
    public void backSlow() {

        motor.set(-0.5); //-1.0 to 1.0 range
        
    }
    public void forwardFast() {

        motor.set(0.6); //-1.0 to 1.0 range
        
    }
    public void backFast() {

        motor.set(0.6); //-1.0 to 1.0 range
        
    }

    public void stop(){
        motor.set(0);
    }


}