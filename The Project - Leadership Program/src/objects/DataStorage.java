package objects;

import uiInterface.RunUI;

public class DataStorage {
	public static RunUI hi = new RunUI();
	public static String choicesSubtitles[][][]={
		{
			{"Do the work yourself", "Threaten them to tell the teacher if they do not meet with you at some time", "Set up a mutual calendar for meetings - promise them a surprise"}
		},
		{
			{"Give them work to do and trust them ", "Force them to do work by telling a teacher or parent", "Tell them honestly how annoyed you are"},
			{"Have a meeting and discuss your reasons and workload", "Do all the work yourself to avoid conflict", "Give up on the second phase of the project"},
			{"Let them do what they want ", "Invite them over and socialize, hinting about the meeting at the end", "Get rid of the meetings altogether and assign work in class"}
		},
		{
			{"Ask them to make ideas together and give them back to you for your pooling", "Invite them over to your house for a play/work session", "Talk to them separately over lunch, gather some ideas, and do the rest yourself"},
			{"Apologize and explain your thinking about the project at a play/work session", "Get mad at your teammates and shove some work at them", "Talk to them over lunch, gather ideas individually, and do the rest of the work yourself "},
			{"Get frustrated at your teammates and throw work at them", "Gather ideas at lunch and do the rest of the work yourself", "Invite them over for a play/work session and talk the project over again"},
			{"Invite them to your house for play and work","Do all the work yourself again and fake the cooperation","Get mad and throw work at your teammates"},
			{"Invite your teammates to your house for a play/work session", "Get mad and throw work at your teammates", "Gather ideas separately at lunch and make the product yourself "},
			{"Reinstitute the mutual calendar", "Gather ideas separately at lunch and do the rest yourself", "Get annoyed and push work at your teammates"}
		},
		{
			{"Make the presentation yourself and then give it to your teammates ", "Meet with your teammates during class, get some ideas, and do the rest yourself", "Set up a mutual calendar and promise your teammates snacks "},
			{"Meet with your teammates during class, get some ideas, and do the rest yourself ", "Set up a mutual calendar of play/work meetings", "Let your teammates do it, they already did so well in the play/work session"},
			{"Set up a mutual calendar with your teammates with a surprise", "Set up a mutual calendar with your teammates with a surprise", "Make the presentation yourself and then give it to your teammates "},
			{"Calmly and persistently request your teammates to do work", "Make the presentation yourself and give it to your teammates", "Set up a mutual calendar with a promise of snacks"},
			{"Meet with your teammates in class, gather some ideas, and do the rest of the work yourself", "Tell your teammates honestly why you all need to work together and meet together", "Make the presentation yourself and give it to your teammates "},
			{"Tell your teammates honestly why you all need to work together and meet together", "Make the presentation yourself and give it to your teammates", "Calmly and persistently request your teammates to do work"}
		},
		{
			{"Give up on the presentation", "Make up a joke", "Try to follow along with the presentation, then get mad at your teammates later"},
			{"Continue and come back to it later ", "Make a joke about the forgotten topic", "Give up on the presentation"},
			{"Make up a joke about the topic", "Try to follow along, then get mad at your teammates later", "Give up"},
			{"Make a joke about the topic and move on", "Continue on with the presentation like nothing happened ", "Give up"},
			{"Try to follow along, then get mad at your teammates later", "Pretend the mistake never happened and keep moving along", "Give up on the project"},
			{"Pretend the mistake never happened and keep moving along", "Get mad at your teammates after following along ", "Stop the presentation "}
		},
	};
	
	public static int times[][] = {
		{34},
		{42,40,50},
		{55,49,45,51,55,57},
		{61,59,62,66,54,46},
		{40,37,56,32,42,56},
		{12,18,18,15,19,13},
		{29,12}
	};
	public static int scores[][][] = {
		{
            //Tier One
			{1,2,3},
		},
		{
            //Tier Two
			{2,1,3},
			{3,2,1},
			{1,3,2},
		},	
		{
            //Tier Three
			{2,3,4},
			{3,1,2},
			{1,2,3},
			{3,1,2},
			{3,1,2},
			{3,2,1},
		}, 
		{
            //Tier Four
			{1,2,3},
			{2,3,1},
			{3,2,1},
			{2,1,3},
			{2,3,1},
			{3,1,2},
		},
		{
            //Tier Five
			{1,3,2},
			{2,3,1},
			{3,2,1},
			{3,2,1},
			{2,3,1},
			{3,2,1},
		}
	};
	
	public static String[][] filePaths = {
    {
        //Tier One
		"LeadVideos/1/a.mp4",
    },
    {
        //Tier Two
		"LeadVideos/2/a.mp4",
        "LeadVideos/2/b.mp4",
        "LeadVideos/2/c.mp4",
    },
    {
        //Tier Three
        "LeadVideos/3/a.mp4",
        "LeadVideos/3/b.mp4",
        "LeadVideos/3/c.mp4",
        "LeadVideos/3/d.mp4",
        "LeadVideos/3/e.mp4",
        "LeadVideos/3/f.mp4",
    },
    {
        //Tier Four
        "LeadVideos/4/a.mp4",
        "LeadVideos/4/b.mp4",
        "LeadVideos/4/c.mp4",
        "LeadVideos/4/d.mp4",
        "LeadVideos/4/e.mp4",
        "LeadVideos/4/f.mp4",
    },
    {
        //Tier Five
        "LeadVideos/5/a.mp4",
        "LeadVideos/5/b.mp4",
        "LeadVideos/5/c.mp4",
        "LeadVideos/5/d.mp4",
        "LeadVideos/5/e.mp4",
        "LeadVideos/5/f.mp4",
    },
    {
        //Tier Six
        "LeadVideos/6/a.mp4",
        "LeadVideos/6/b.mp4",
        "LeadVideos/6/c.mp4",
        "LeadVideos/6/d.mp4",
        "LeadVideos/6/e.mp4",
        "LeadVideos/6/f.mp4",
    },
	};	
}

