package core.model;

public class DrawModel {
	
	private int mDim;
	private int mL;
	private int ml;
	private int mLi;
	
	public DrawModel(int mDim, int mL, int ml2, int mLi, int mCo) {
		super();
		this.mDim = mDim;
		this.mL = mL;
		ml = ml2;
		this.mLi = mLi;
		this.mCo = mCo;
	}

	public int getmDim() {
		return mDim;
	}

	public void setmDim(int mDim) {
		this.mDim = mDim;
	}

	public int getmL() {
		return mL;
	}

	public void setmL(int mL) {
		this.mL = mL;
	}

	public int getMl() {
		return ml;
	}

	public void setMl(int ml) {
		this.ml = ml;
	}

	public int getmLi() {
		return mLi;
	}

	public void setmLi(int mLi) {
		this.mLi = mLi;
	}

	public int getmCo() {
		return mCo;
	}

	public void setmCo(int mCo) {
		this.mCo = mCo;
	}

	private int mCo;
	
	public DrawModel() {
		
	}
//	
//	
//	public DrawModel(int mDim, int mL, int ml2) {
//		super();
//		this.mDim = mDim;
//		this.mL = mL;
//		ml = ml2;
//	}
//
//	public int getmDim() {
//		return mDim;
//	}
//
//	public void setmDim(int mDim) {
//		this.mDim = mDim;
//	}
//
//	public int getmL() {
//		return mL;
//	}
//
//	public void setmL(int mL) {
//		this.mL = mL;
//	}
//
//	public int getMl() {
//		return ml;
//	}
//
//	public void setMl(int ml) {
//		this.ml = ml;
//	}

	public int drawTriangle(int Dim) {
		for (int i = 0 ; i <= this.mDim ; i ++) {
				System.out.print(" ");
				for(int j = 0 ; j <= i; j ++) {
					System.out.print("*");
				}
				System.out.println();
			
		}
		return this.mDim;
	}
	
	public int drawSquare(int side) {
		int	row =1;
		int column=1;
	    while (row <= side)
	        {
	            column = 1;
	            System.out.print("*");
	            while (column <= (side - 2))
	            {
	                System.out.print(row == 1 || row == side ? "*" : " ");
	                ++column;
	            }
	            ++row;
	            System.out.printf("*%n");
	        }
		return 0;
	}

	public int drawRect(int L,int l) {
		for(int i = 1; i<=L;i++) {
			for(int j =1; j<=l;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
        }
		return 0;
	}
	
	public int drawDiamond(int side) {
		int count = 1;
        for (int i = 1; i <= 2 * side - 1; i++) {
            for (int j = count; j <= side; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= count * 2 - 1; k++) {
                System.out.print("* ");
            }
            if (i < side)
                count++;
            else
                count--;
            System.out.println("");
}
		return 0;
	}
	
	public int drawParalelogram(int row, int col) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) 
			    	System.out.print(" "); 
			for (int j = 1; j <= col; j++) 
				System.out.print("*");
			System.out.println();
		}
		return 0;
	}

	public int drawCircle(int radius) {
		double dist;
	    for (int i = 0; i <= 2 * radius; i++)
	    {
	    	for (int j = 0; j <= 2 * radius; j++) {
	        dist = Math.sqrt((i - radius) * (i - radius) +
	                         (j - radius) * (j - radius));
	        if (dist > radius - 0.5 && dist < radius + 0.5)
	        System.out.print("*");
	        else
	        System.out.print(" ");
	    }
	    System.out.print("\n");
	}
	    return 0;
	}
}
