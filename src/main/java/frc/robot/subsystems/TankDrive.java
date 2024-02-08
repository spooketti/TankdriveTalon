package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TankDrive extends SubsystemBase{
    private TalonSRX L1 = new TalonSRX(15);
    private TalonSRX L2 = new TalonSRX(13);
    private TalonSRX R1 = new TalonSRX(12);
    private TalonSRX R2 = new TalonSRX(111);


    public TankDrive()
    {
        R2.setInverted(true);
        R1.setInverted(true);
    }

    public void DriveAround(double leftSpeed, double rightSpeed)
    {
        L1.set(TalonSRXControlMode.PercentOutput, leftSpeed);
        L2.set(TalonSRXControlMode.PercentOutput, leftSpeed);
        R1.set(TalonSRXControlMode.PercentOutput, rightSpeed);
        R2.set(TalonSRXControlMode.PercentOutput, rightSpeed);
    }
    
}
