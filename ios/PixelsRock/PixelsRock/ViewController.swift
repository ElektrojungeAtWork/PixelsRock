//
//  ViewController.swift
//  PixelsRock
//
//  Created by Benjamin on 25.04.18.
//  Copyright © 2018 Benjamin Scholtysik. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    private var pixelColor = UIColor.white
    
    @IBOutlet weak var pixelView1: PixelView!
    @IBOutlet weak var pixelView2: PixelView!
    @IBOutlet weak var pixelView3: PixelView!
    @IBOutlet weak var pixelView4: PixelView!
    @IBOutlet weak var pixelView5: PixelView!
    @IBOutlet weak var pixelView6: PixelView!
    @IBOutlet weak var pixelView7: PixelView!
    @IBOutlet weak var pixelView8: PixelView!
    @IBOutlet weak var pixelView9: PixelView!
    @IBOutlet weak var pixelView10: PixelView!
    @IBOutlet weak var pixelView11: PixelView!
    @IBOutlet weak var pixelView12: PixelView!
    @IBOutlet weak var pixelView13: PixelView!
    @IBOutlet weak var pixelView14: PixelView!
    @IBOutlet weak var pixelView15: PixelView!
    @IBOutlet weak var pixelView16: PixelView!
    @IBOutlet weak var pixelView17: PixelView!
    @IBOutlet weak var pixelView18: PixelView!
    @IBOutlet weak var pixelView19: PixelView!
    @IBOutlet weak var pixelView20: PixelView!
    @IBOutlet weak var pixelView21: PixelView!
    @IBOutlet weak var pixelView22: PixelView!
    @IBOutlet weak var pixelView23: PixelView!
    @IBOutlet weak var pixelView24: PixelView!
    @IBOutlet weak var pixelView25: PixelView!
    @IBOutlet weak var pixelView26: PixelView!
    @IBOutlet weak var pixelView27: PixelView!
    @IBOutlet weak var pixelView28: PixelView!
    @IBOutlet weak var pixelView29: PixelView!
    @IBOutlet weak var pixelView30: PixelView!
    @IBOutlet weak var pixelView31: PixelView!
    @IBOutlet weak var pixelView32: PixelView!
    @IBOutlet weak var pixelView33: PixelView!
    @IBOutlet weak var pixelView34: PixelView!
    @IBOutlet weak var pixelView35: PixelView!
    @IBOutlet weak var pixelView36: PixelView!
    @IBOutlet weak var pixelView37: PixelView!
    @IBOutlet weak var pixelView38: PixelView!
    @IBOutlet weak var pixelView39: PixelView!
    @IBOutlet weak var pixelView40: PixelView!
    @IBOutlet weak var pixelView41: PixelView!
    @IBOutlet weak var pixelView42: PixelView!
    @IBOutlet weak var pixelView43: PixelView!
    @IBOutlet weak var pixelView44: PixelView!
    @IBOutlet weak var pixelView45: PixelView!
    @IBOutlet weak var pixelView46: PixelView!
    @IBOutlet weak var pixelView47: PixelView!
    @IBOutlet weak var pixelView48: PixelView!
    @IBOutlet weak var pixelView49: PixelView!
    @IBOutlet weak var pixelView50: PixelView!
    @IBOutlet weak var pixelView51: PixelView!
    @IBOutlet weak var pixelView52: PixelView!
    @IBOutlet weak var pixelView53: PixelView!
    @IBOutlet weak var pixelView54: PixelView!
    @IBOutlet weak var pixelView55: PixelView!
    @IBOutlet weak var pixelView56: PixelView!
    @IBOutlet weak var pixelView57: PixelView!
    @IBOutlet weak var pixelView58: PixelView!
    @IBOutlet weak var pixelView59: PixelView!
    @IBOutlet weak var pixelView60: PixelView!
    @IBOutlet weak var pixelView61: PixelView!
    @IBOutlet weak var pixelView62: PixelView!
    @IBOutlet weak var pixelView63: PixelView!
    @IBOutlet weak var pixelView64: PixelView!
    
    @IBOutlet weak var resetButton: UIButton!
    
    var pixelViews : [PixelView] = []
   
    override func viewDidLoad() {
        super.viewDidLoad()

        pixelViews = [pixelView1, pixelView2, pixelView3, pixelView4, pixelView5, pixelView6, pixelView7, pixelView8,
                      pixelView9, pixelView10, pixelView11, pixelView12, pixelView13, pixelView14, pixelView15, pixelView16,
                      pixelView17, pixelView18, pixelView19, pixelView20, pixelView21, pixelView22, pixelView23, pixelView24,
                      pixelView25, pixelView26, pixelView27, pixelView28, pixelView29, pixelView30, pixelView31, pixelView32,
                      pixelView33, pixelView34, pixelView35, pixelView36, pixelView37, pixelView38, pixelView39, pixelView40,
                      pixelView41, pixelView42, pixelView43, pixelView44, pixelView45, pixelView46, pixelView47, pixelView48,
                      pixelView49, pixelView50, pixelView51, pixelView52, pixelView53, pixelView54, pixelView55, pixelView56,
                      pixelView57, pixelView58, pixelView59, pixelView60, pixelView61, pixelView62, pixelView63, pixelView64,
        ]
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    @IBAction func resetPixels(_ sender: Any) {
        for pixelView in self.pixelViews {
            pixelView.backgroundColor = UIColor.lightGray
        }
    }
    
}

