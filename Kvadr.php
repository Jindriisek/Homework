<?php
require "ITeleso.php";
class Kvadr implements ITeleso
{
    private $a;
    private $b;
    private $c;
    private $Sp;
    private $Spl;
    private $V;
    public function setA($a)
    {
        $this->a = $a;
    }
    public function setB($b)
    {
        $this->b = $b;
    }
    public function setC($c)
    {
        $this->c = $c;
    }
    public function __construct($a = 0, $b = 0, $c = 0)
    {
        $this->setA($a);
        $this->setB($b);
        $this->setC($c);
    }
    public function setSP()
    {
        $Sp = $this->a * $this->b;
        $this->Sp = $Sp;
    }
    public function povrch()
    {
        $Sp = 0;
        $Spl = 0;
        $Sp = $this->a * $this->b;
        $Spl = (($this->a * $this->c) + ($this->b * $this->c));
        return 2 *($Sp + $Spl);
    }
    public function objem()
    {
        $a = 0;
        $b = 0;
        $c = 0;
        $V = 0;
        $V =  $this->a * $this->b * $this->c;
        return $V;
    }
    public function is3D()
    {
        if (($this->a > 0) and ($this->b > 0) and ($this->c > 0)) {
            return "Je 3D";
        } else {
            return "Není 3D";
        }
    }
    public function pocetVrcholu()
    {
        return "Počet vrcholů je: 8";
    }
    public function info(): string
    {
        return "Kvádr<br>\n" .
        $this->is3D() . "<br>" .
        $this->pocetVrcholu() . "<br>" .
        "Povrch je: " . $this->povrch() . "<br>" .
        "Objem je: " . $this->objem() . "<br>";
    }
}