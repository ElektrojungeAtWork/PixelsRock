//
//  PixelView.swift
//  PixelsRock
//
//  Created by Benjamin on 25.04.18.
//  Copyright © 2018 Benjamin Scholtysik. All rights reserved.
//

import UIKit

class PixelView: UIView {

    public var pixelColor : UIColor = UIColor.blue
    
    public override init(frame: CGRect) {
        super.init(frame: frame)
    }
    
    required init?(coder aDecoder: NSCoder) {
        super.init(coder: aDecoder)        
    }
    
    override func touchesBegan(_ touches: Set<UITouch>, with event: UIEvent?) {
        self.backgroundColor = self.pixelColor
    }
    
}
