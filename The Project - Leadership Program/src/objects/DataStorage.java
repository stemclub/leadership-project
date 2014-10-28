package objects;

public class DataStorage {
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
		{"LeadItUp/1/a.mov"},
    },
    {
        //Tier Two
		{"LeadItUp/2/a.mov"},
        {"LeadItUp/2/b.mov"},
        {"LeadItUp/2/c.mov"},
    },
    {
        //Tier Three
        {"LeadItUp/3/a.mov"},
        {"LeadItUp/3/b.mov"},
        {"LeadItUp/3/c.mov"},
        {"LeadItUp/3/d.mov"},
        {"LeadItUp/3/e.mov"},
        {"LeadItUp/3/f.mov"},
    },
    {
        //Tier Four
        {"LeadItUp/4/a.mov"},
        {"LeadItUp/4/b.mov"},
        {"LeadItUp/4/c.mov"},
        {"LeadItUp/4/d.mov"},
        {"LeadItUp/4/e.mov"},
        {"LeadItUp/4/f.mov"},
    },
    {
        //Tier Five
        {"LeadItUp/5/a.mov"},
        {"LeadItUp/5/b.mov"},
        {"LeadItUp/5/c.mov"},
        {"LeadItUp/5/d.mov"},
        {"LeadItUp/5/e.mov"},
        {"LeadItUp/5/f.mov"},
    },
    {
        //Tier Six
        {"LeadItUp/6/a.mov"},
        {"LeadItUp/6/b.mov"},
        {"LeadItUp/6/c.mov"},
        {"LeadItUp/6/d.mov"},
        {"LeadItUp/6/e.mov"},
        {"LeadItUp/6/f.mov"},
    },
	};	
}

