package org.team1540.robot2017.subsystems;

import org.team1540.robot2017.RobotMap;

import com.ctre.CANTalon;
import com.ctre.CANTalon.TalonControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {

	private final CANTalon intakeTalon = new CANTalon(RobotMap.intakeTalon);
	
	public Intake() {
		intakeTalon.changeControlMode(TalonControlMode.PercentVbus);
	}
	
	public void set(double output) {
		intakeTalon.set(output);
	}
	
	@Override
	protected void initDefaultCommand() {
		
	}
}
