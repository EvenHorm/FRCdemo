package frc.robot.Commands;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;
import frc.robot.Subsystems.Lights;

public class FastCommand extends Command {

    boolean isFinished;
    int time;
    Lights lights = Constants.lights;
    @Override
    public void initialize(){
        Constants.motor.backSlow();
    }
    @Override
    public void execute(){
        lights.setColorRed(30, 150, 50);

        
    }
    @Override
    public boolean isFinished(){
        return isFinished;

    }

    @Override
    public void end(boolean interrupted) {
        Constants.motor.stop();
        lights.setColorOrange(30,150,50);

    }   
}
