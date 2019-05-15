package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand
{
    Job2dDriver job2dDriver = null;
    public int x;
    public int y;

    public SetPositionCommand(Job2dDriver j2dd)
    {
        job2dDriver = j2dd;
        x = 0;
        y = 0;
    }

    @Override
    public void execute()
    {
        job2dDriver.setPosition(x, y);
    }
}
