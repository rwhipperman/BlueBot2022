package frc.robot.subsystems;

import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.helpers.CCSparkMax;
import frc.parent.RobotMap;
public class BarLifter extends SubsystemBase {
    private final CCSparkMax lifter = new CCSparkMax("Lifter", "lift", RobotMap.LIFTER_PORT, 
    MotorType.kBrushless, IdleMode.kBrake, RobotMap.LIFTER_REVERSE, true);
}