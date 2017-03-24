package org.team1540.robot2017.commands.auto;

import org.team1540.robot2017.Robot;
import org.team1540.robot2017.commands.DriveForTime;
import org.team1540.robot2017.commands.RunMotionProfile;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoPlaceGearLeft extends CommandGroup {
    public AutoPlaceGearLeft() {
        addSequential(new RunMotionProfile("gear_left"));
//        addSequential(new PlaceGear());
        addSequential(new DriveForTime(Robot.tuning.getAutoDrivingGearBackoffTime(), 
                Robot.tuning.getAutoDrivingGearBackoffSet()));
    }
}