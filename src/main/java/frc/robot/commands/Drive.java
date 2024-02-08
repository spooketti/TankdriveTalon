package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.TankDrive;
import frc.robot.*;

public class Drive extends Command {

    private DoubleSupplier leftSpeed;
    private DoubleSupplier rightSpeed;

    public Drive(DoubleSupplier leftSpeed, DoubleSupplier rightSpeed)
    {
        this.leftSpeed = leftSpeed;
        this.rightSpeed = rightSpeed;
        addRequirements(Robot.tankDrive);
    }

    @Override
    public void execute()
    {
        Robot.tankDrive.DriveAround(leftSpeed.getAsDouble(), rightSpeed.getAsDouble());
    }
}
