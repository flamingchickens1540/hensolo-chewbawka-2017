package org.team1540.robot2017.commands.auto;

import org.team1540.robot2017.Robot;
import org.team1540.robot2017.commands.ResetGearMechanism;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoPlaceGearCenter extends CommandGroup {
    public AutoPlaceGearCenter() {
        addSequential(new ResetGearMechanism());
        addSequential(new RunMotionProfile("gear_center"));
        addSequential(new PlaceGear2(), Robot.tuning.getAutoGearPlacementSecs());
        addSequential(new DriveForTime(Robot.tuning.getAutoDrivingGearBackoffTime(), 
                Robot.tuning.getAutoDrivingGearBackoffSet()));
    }
    
//    @Override
//    public void execute() {
//        super.execute();
//        boolean encoderWorking = 
//                Math.abs(Robot.driveTrain.getLeftProfileError()) < Robot.tuning.getMotionProfilingAllowedError()
//             && Math.abs(Robot.driveTrain.getRightProfileError()) < Robot.tuning.getMotionProfilingAllowedError();
//        boolean motionProfileRunning = Robot.driveTrain.isProfileRunning();
//        if (!encoderWorking && motionProfileRunning) {
//            this.cancel();
//        }
//    }
}
