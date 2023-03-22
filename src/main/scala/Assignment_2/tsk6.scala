package Assignment_2

import chisel3._
import chisel3.util._
import chisel3.experimental.{BaseModule}

trait ModuleIO{
  def in1: UInt
  def in2: UInt
  def out: UInt
}

class Add extends RawModule with ModuleIO{
  val in1 = IO(Input(UInt(8.W)))
  val in2 = IO(Input(UInt(8.W)))
  val out = IO(Output(UInt(8.W)))
  out := in1 + in2
}

class Sub extends RawModule with ModuleIO{
  val in1 = IO(Input(UInt(8.W)))
  val in2 = IO(Input(UInt(8.W)))
  val out = IO(Output(UInt(8.W)))
  out := in1 - in2
}

class Top[T1 <: BaseModule with ModuleIO, T2 <: BaseModule with ModuleIO](genT1: =>T1, genT2: =>T2) extends Module{
  val io = IO(new Bundle {
    val in1 = IO(Input(UInt(8.W)))
    val in2 = IO(Input(UInt(8.W)))
    val out = IO(Output(UInt(8.W)))
    })
  val sub_Module1 = Module(genT1)
  val sub_Module2 = Module(genT2)

  io.out := sub_Module1.out
  sub_Module1.in1 := io.in1
  sub_Module1.in2 := io.in2

  io.out := sub_Module2.out
  sub_Module2.in1 := io.in1
  sub_Module2.in2 := io.in2
}