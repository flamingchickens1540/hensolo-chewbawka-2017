package org.team1540.robot2017.commands;

import org.team1540.robot2017.OI;
import org.team1540.robot2017.Robot;
import org.team1540.robot2017.RobotUtil;

import edu.wpi.first.wpilibj.command.Command;

public class JoystickClimb extends Command {
	public JoystickClimb() {
		requires(Robot.climber);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		Robot.climber.joyClimb(RobotUtil.deadzone(OI.getClimberJoystick(), Robot.tuning.getJoystickDeadzone()));
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}